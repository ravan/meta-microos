SUMMARY = "A collection of Python deprecation patterns and strategies"
DESCRIPTION = "A collection of Python deprecation patterns and strategies that help \
you collect your technical debt in a non-destructive manner. The goal \
of this library is to provide well documented developer facing \
deprecation patterns that start of with a basic set and can expand \
into a larger set of patterns as time goes on. The desired output of \
these patterns is to apply the warnings module to emit \
DeprecationWarning or PendingDeprecationWarning or similar derivative \
to developers using libraries (or potentially applications) about \
future deprecations."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python314-debtcollector-3.1.0-2.2.noarch.rpm"
RPM_HASH = "00534d5fbb18c6d08ec0cb69252f9028bc9304eb176473c31ef3444106753f1b9154542228d0848529c1fea927376c468f647d3af99268621aa3d4d2e5b38de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-debtcollector \
python314-debtcollector \
python3dist-debtcollector"

RDEPENDS:${PN} += "python-abi \
python314-importlib-metadata \
python314-pbr \
python314-wrapt"

inherit rpm
