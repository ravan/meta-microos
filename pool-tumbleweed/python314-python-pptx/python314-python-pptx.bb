SUMMARY = "Generate and manipulate Open XML PowerPoint (pptx) files"
DESCRIPTION = "Create, read, and update PowerPoint 2007+ (.pptx) files."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python314-python-pptx-1.0.2-2.4.noarch.rpm"
RPM_HASH = "3215b9e8883b2278c2655a8cc039e8c0dad7528189416fef683374865e81859c6d2c9692f8930b03b6900cf26016c89b2f9a05e9c8d42f29d98d9fa50e1bb5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-pptx \
python314-python-pptx \
python3dist-python-pptx"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-XlsxWriter \
python314-lxml \
python314-typing-extensions"

inherit rpm
