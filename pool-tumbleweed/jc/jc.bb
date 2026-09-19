SUMMARY = "JSON CLI output utility"
DESCRIPTION = "jc is used to JSONify the output of many standard linux cli tools \
and file types for easier parsing in scripts."
LICENSE = "MIT"

PV = "1.25.7"

RPM_NAME = "jc-1.25.7-1.2.noarch.rpm"
RPM_HASH = "a5850daf97f15905685ac146f2ec9d6e6bf2474cc7e8ce91ca97806567cd9ca77cc621f045690d7a1aff8f8fa84204e96e259965881b4bb1974dff1f6f2b4ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jc \
python3.13dist-jc \
python3dist-jc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Pygments \
python3-ruamel.yaml \
python3-xmltodict"

inherit rpm
