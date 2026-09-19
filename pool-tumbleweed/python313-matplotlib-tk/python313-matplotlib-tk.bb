SUMMARY = "Tk backend for python313-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-tk-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "651ef362d9c91ee0e15b30aa6e4c469f140e62c8333f49ec592ba7bcab14f50a9fe37c1ed40140bbe29e628bbb93eb8b98f9e1f14743d5cf23efe5888cf4cdab"

RPROVIDES:${PN} += "python3-matplotlib-tk \
python313-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python313-Pillow-tk \
python313-matplotlib \
python313-tk \
tcl"

inherit rpm
