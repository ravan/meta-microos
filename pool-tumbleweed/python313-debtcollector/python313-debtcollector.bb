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

RPM_NAME = "python313-debtcollector-3.1.0-2.2.noarch.rpm"
RPM_HASH = "aedb0a0c675104981da68660122b153820de5bd1f92bc9a64e8871fdc6ce0e61fbdc306b3b529947e0787cae312b0fe25578bc0436e201eb2875b624f1844770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-debtcollector \
python3.13dist-debtcollector \
python313-debtcollector \
python3dist-debtcollector"

RDEPENDS:${PN} += "python-abi \
python313-importlib-metadata \
python313-pbr \
python313-wrapt"

inherit rpm
