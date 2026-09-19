SUMMARY = "Text to activity-diagram image generator"
DESCRIPTION = "actdiag generates activity-diagram image files from spec-text files."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python314-actdiag-3.0.0-5.5.noarch.rpm"
RPM_HASH = "9ded627d48b33702f3e16e7a303fc623d063415c7503e43a016dae2f3e5ef6a33afdce479aa156f3bcd88118f29e5c6216d14cf8fb82972b0e5b7249ca607cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-actdiag \
python314-actdiag \
python3dist-actdiag"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-blockdiag"

inherit rpm
