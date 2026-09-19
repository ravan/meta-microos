SUMMARY = "Extract information from video files"
DESCRIPTION = "To extract information from video files."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python313-knowit-0.6.1-1.1.noarch.rpm"
RPM_HASH = "3ac96f1d7a3492232ff63d0ec5c55d09ed1ad4ed7013c2282bacd8d9b7b0784a5e4fb90f5e16537ed3498a5e44fc1b0034466eeb88cca370234d493b5ccc7171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-knowit \
python3.13dist-knowit \
python313-knowit \
python3dist-knowit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pint \
python313-PyYAML \
python313-babelfish \
python313-enzyme \
python313-pymediainfo \
python313-trakit \
update-alternatives"

inherit rpm
