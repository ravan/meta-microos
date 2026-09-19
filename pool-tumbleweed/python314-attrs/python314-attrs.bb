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

RPM_NAME = "python314-attrs-26.1.0-1.4.noarch.rpm"
RPM_HASH = "3aa5a74a20bf29a58e3b7ff9855a4ead465170cd529d02a861515a8e6f8b7324e79aac6cbe152cd399dd76cc8faa18d02892fe702fe425464ffb62538a2f0f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-attrs \
python314-attrs \
python3dist-attrs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
