SUMMARY = "An in-process file monitor"
DESCRIPTION = "Hupper is an integrated process monitor that will track changes to any \
imported Python files in sys.modules as well as custom paths. \
When files are changed the process is restarted."
LICENSE = "MIT"

PV = "1.12.1"

RPM_NAME = "python314-hupper-1.12.1-3.4.noarch.rpm"
RPM_HASH = "39f51569c49435fe78e0e4c83eb057e52f5a618ad3be4ef27c96b51386f5e99bc9e32a8b7b0d280f671a22f246fa6349f06067b8d4cebff31df2199e7d95f5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hupper \
python314-hupper \
python3dist-hupper"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-watchdog \
update-alternatives"

inherit rpm
