SUMMARY = "Attributes without boilerplate"
DESCRIPTION = "attrs is an MIT-licensed Python package with class decorators that ease the \
chores of implementing the most common attribute-related object protocols. \
 \
You just specify the attributes to work with and attrs gives you: \
  - a nice human-readable __repr__, \
  - a complete set of comparison methods, \
  - an initializer, \
  - and much more \
 \
without writing dull boilerplate code again and again. \
 \
This gives you the power to use actual classes with actual types in your code \
instead of confusing tuples or confusingly behaving namedtuples. \
 \
So put down that type-less data structures and welcome some class into your \
life! \
 \
python-attrs is the successor to python-characterstic"
LICENSE = "MIT"

PV = "26.1.0"

RPM_NAME = "python313-attrs-26.1.0-1.4.noarch.rpm"
RPM_HASH = "0022983ca2515b38787560875c552bcdb9feb417fa245bb8777ce50bd97b772b7535d33b48a651e7345affbc1099f3f2928b1fc82688b8c36a7a7bef8cae961d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-attrs \
python3.13dist-attrs \
python313-attrs \
python3dist-attrs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
