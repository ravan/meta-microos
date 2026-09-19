SUMMARY = "XML Im-/Exporter"
DESCRIPTION = "XML Im-/Exporter is a low level library to assist you in the straight \
forward process of importing and exporting XML from and to your Java \
classes. All of this is designed having performance and simplicity in \
mind."
LICENSE = "LGPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "xml-im-exporter-javadoc-1.1-31.9.noarch.rpm"
RPM_HASH = "6853e5eeed45cee9067d2d71206f1276957f2bc835424d93cb3576640f40c83a8cc6c8d5fd643c96977230c2e7fcd017c0a9448025d1c1af4e3157f139b3ff44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-im-exporter-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
