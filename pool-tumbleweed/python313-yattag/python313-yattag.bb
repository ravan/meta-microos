SUMMARY = "Generate HTML or XML in a pythonic way"
DESCRIPTION = "Generate HTML or XML in a pythonic way. \
Pure python alternative to web template engines. \
Can fill HTML forms with default values and error messages."
LICENSE = "LGPL-2.1-only"

PV = "1.16.1"

RPM_NAME = "python313-yattag-1.16.1-2.5.noarch.rpm"
RPM_HASH = "c06733f8c807386e3affedc3341207240d254d5f132f1ca63213d434374017df312c476979bad673d02b3760a25e6d9fef449175541a3919f6494f9e8ce6041e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yattag \
python3.13dist-yattag \
python313-yattag \
python3dist-yattag"

RDEPENDS:${PN} += "python-abi"

inherit rpm
