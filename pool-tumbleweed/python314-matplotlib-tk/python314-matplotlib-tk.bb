SUMMARY = "Tk backend for python314-matplotlib"
DESCRIPTION = "This package includes the Tk-based tkagg backend \
for the python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-tk-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "e918c286fe29b07d944c6a65f01b14e8c903e9c933f3a26ece96ecda932a7458436b9b584eda49bf67a5dffb1ec2f81d3e15895fdd29f9e13c9a4e47446c9e48"

RPROVIDES:${PN} += "python314-matplotlib-tk"

RDEPENDS:${PN} += "python-abi \
python314-Pillow-tk \
python314-matplotlib \
python314-tk \
tcl"

inherit rpm
