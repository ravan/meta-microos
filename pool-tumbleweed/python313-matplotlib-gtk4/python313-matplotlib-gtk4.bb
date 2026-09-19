SUMMARY = "GTK4 backends for python313-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-gtk4-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "0bc66167841c4e151fca57cf4792e033e300b884359cdb6eaf0110fbee02708a2ae1e28186e40526205e91f17d98468e84216e4114feff21e50af5604ef56ccb"

RPROVIDES:${PN} += "python3-matplotlib-gtk4 \
python313-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-matplotlib-gtk-common"

inherit rpm
