SUMMARY = "Generate HTML or XML in a pythonic way"
DESCRIPTION = "Generate HTML or XML in a pythonic way. \
Pure python alternative to web template engines. \
Can fill HTML forms with default values and error messages."
LICENSE = "LGPL-2.1-only"

PV = "1.16.1"

RPM_NAME = "python314-yattag-1.16.1-2.5.noarch.rpm"
RPM_HASH = "8be9f6ae1b92d874120edfe95fe04fa27630824815d1fec3d18f1f872578748e94543069c90e95da0141ad690404d378a42a41a6f212a5b81be0cb265c8d27c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-yattag \
python314-yattag \
python3dist-yattag"

RDEPENDS:${PN} += "python-abi"

inherit rpm
