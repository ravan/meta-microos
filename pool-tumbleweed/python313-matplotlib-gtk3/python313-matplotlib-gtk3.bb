SUMMARY = "GTK3 backends for python313-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-gtk3-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "20a1d05e8d06c37341f702beee1e869d90e5693ea977a21c79020417d739b38e56e2d6aaec3350b3fc61d207150f31586fc3ed4a2b7f260eaef844ad39020526"

RPROVIDES:${PN} += "python3-matplotlib-gtk3 \
python313-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-matplotlib-gtk-common"

inherit rpm
