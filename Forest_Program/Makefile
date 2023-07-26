ANT	= env LC_ALL=ja_JP.UTF-8 ant
ARCHIVE	= $(shell basename `pwd`)

all:
	$(ANT) all

clean:
	$(ANT) clean

test:
	$(ANT) test

testall: tree forest semilattice
	@:

tree: clean
	$(ANT) tree

forest: clean
	$(ANT) forest

semilattice: clean
	$(ANT) semilattice

install:
	$(ANT) install

doc:
	$(ANT) doc

wipe: clean
	@find . -name ".DS_Store" -exec rm {} ";" -exec echo rm -f {} ";"
	(cd ../ ; rm -f ./$(ARCHIVE).zip)

#zip:
#	$(ANT) zip

zip: wipe
	@find . -exec touch -t `date "+%Y%m%d%H%M"` {} \; ; xattr -cr .
	(cd ../ ; zip -r ./$(ARCHIVE).zip ./$(ARCHIVE)/ --exclude='*/.svn/*')

app: install
	@xattr -cr ./Forest.app
	open ./Forest.app

check: if while for ifTrue ifFalse ifThenElse whileTrue whileFalse forEach
	@:

if:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'if[\ \t]*\(' {} \; | sort

ifTrue:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'ifTrue[\ \t]*\(' {} \; | sort

ifFalse:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'ifFalse[\ \t]*\(' {} \; | sort

ifThenElse:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'ifThenElse[\ \t]*\(' {} \; | sort

while:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'while[\ \t]*\(' {} \; | sort

whileTrue:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'whileTrue[\ \t]*\(' {} \; | sort

whileFalse:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'whileFalse[\ \t]*\(' {} \; | sort

for:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'for[\ \t]*\(' {} \; | sort

forEach:
	@echo "---<" $@ ">---" 
	@find . -name '*.java' -exec grep -HnE 'forEach[\ \t]*\(' {} \; | sort
