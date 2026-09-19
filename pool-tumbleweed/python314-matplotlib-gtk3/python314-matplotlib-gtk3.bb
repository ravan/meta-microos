SUMMARY = "GTK3 backends for python314-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python314-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python314-matplotlib-gtk3-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "70e6409aecb3d6a27527455640f60ffa7240263860f502e1c65ad0c4b020a4358aa64e74c1670728440ce5737d56af773f4584447342b0350890625a8c9c3b19"

RPROVIDES:${PN} += "python314-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-matplotlib-gtk-common"

inherit rpm
