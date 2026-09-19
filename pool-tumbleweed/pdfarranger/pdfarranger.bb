SUMMARY = "Merge, split, rotate, crop, and rearrange pages of PDF documents"
DESCRIPTION = "pdfarranger is a small python-gtk application, which helps the user \
to merge or split pdf documents and rotate, crop and rearrange their \
pages using a graphical interface. It is a frontend for pikepdf."
LICENSE = "GPL-3.0-only"

PV = "1.14.0"

RPM_NAME = "pdfarranger-1.14.0-1.1.noarch.rpm"
RPM_HASH = "fa4e7983821b62f85ec4c02b3d00da7e598fc71c0333a6092ab5a7ae6283aba37d230670fd0d6a0ad4d412f17557e300cda56449d8d63a690ca8d7fbdba19679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdfarranger \
python3.13dist-pdfarranger \
python3dist-pdfarranger"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-cairo \
python3-dateutil \
python3-gobject-Gdk \
python3-packaging \
python3-pikepdf \
typelib-1-0-Gtk-3-0 \
typelib-1-0-Poppler-0-18"

inherit rpm
