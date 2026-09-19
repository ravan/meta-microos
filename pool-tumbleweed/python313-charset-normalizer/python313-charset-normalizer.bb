SUMMARY = "Python Universal Charset detector"
DESCRIPTION = "Python Universal Charset detector."
LICENSE = "MIT"

PV = "3.4.9"

RPM_NAME = "python313-charset-normalizer-3.4.9-1.1.noarch.rpm"
RPM_HASH = "794a5f2f22f645702fb09a4c819ca5ef9db71921f3edaa2ac363bcca9e52c5156f6f2408340a44ab6934fd5a564c6416068a6ba764cfca2bcb03fce0c62c39fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-charset-normalizer \
python3.13dist-charset-normalizer \
python313-charset-normalizer \
python3dist-charset-normalizer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
