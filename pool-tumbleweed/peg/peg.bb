SUMMARY = "Recursive-Descent parser generators for C"
DESCRIPTION = "peg(1) and leg(1) are tools for generating recursive-descent \
parsers: programs that perform pattern matching on text. They \
processes a Parsing Expression Grammar (PEG) to produce a program \
that recognises legal sentences of that grammar. peg(1) processes \
PEGs written using the original syntax described by Ford while \
leg(1) processes PEGs written using slightly different syntax and \
conventions that are intended to make it an attractive replacement \
for parsers built with lex(1) and yacc(1). Unlike lex(1) and \
yacc(1), peg(1) and leg(1) support unlimited backtracking, provide \
ordered choice as a means for disambiguation, and can combine \
scanning (lexical analysis) and parsing (syntactic analysis) into a \
single activity."
LICENSE = "MIT"

PV = "0.1.20"

RPM_NAME = "peg-0.1.20-1.11.aarch64.rpm"
RPM_HASH = "b604d9a3ee2c4f63fed3790647b5682007e49e5a5bbf9fe420e13b806dbe5ce71495ede397082b5cac0da814dab3d0bc61397376083a801314c98cee8dff27a5"

RPROVIDES:${PN} += "peg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
