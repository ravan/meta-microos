SUMMARY = "ASDF coordinates schemas"
DESCRIPTION = "ASDF coordinates schemas"
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python313-asdf-coordinates-schemas-0.5.1-1.4.noarch.rpm"
RPM_HASH = "8b0204fd3f5359563023bf2d2f33d4cdc4ecebbc2c8074768727d48f3f3b448d1ba95025c1bb24847ee70e94ceac67146fe2b0df4cbf2d888da2214af961b445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-coordinates-schemas \
python3.13dist-asdf-coordinates-schemas \
python313-asdf-coordinates-schemas \
python3dist-asdf-coordinates-schemas"

RDEPENDS:${PN} += "python-abi \
python313-asdf \
python313-asdf-standard"

inherit rpm
