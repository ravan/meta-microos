SUMMARY = "Java packages filesystem layout"
DESCRIPTION = "This package provides some basic directories into which Java packages \
install their content."
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "javapackages-filesystem-6.5.1-3.2.aarch64.rpm"
RPM_HASH = "5972abca1e072fed963417fe4e19f64371b021ac4077f82cad484d9e0e64b21bd0f7b252eb9509c4bdb05d6dc8964302f0989753acf3c9d2d1b6a4c49a642ef8"

RPROVIDES:${PN} += "javapackages-filesystem \
rpm-macro--ivyxmldir \
rpm-macro--javaconfdir \
rpm-macro--javadir \
rpm-macro--javadocdir \
rpm-macro--jnidir \
rpm-macro--jpbindingdir \
rpm-macro--jvmcommondatadir \
rpm-macro--jvmcommonlibdir \
rpm-macro--jvmcommonsysconfdir \
rpm-macro--jvmdatadir \
rpm-macro--jvmdir \
rpm-macro--jvmlibdir \
rpm-macro--jvmprivdir \
rpm-macro--jvmsysconfdir \
rpm-macro--mavenpomdir"

RDEPENDS:${PN} += ""

inherit rpm
