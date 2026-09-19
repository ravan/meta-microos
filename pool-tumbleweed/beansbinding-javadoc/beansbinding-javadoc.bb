SUMMARY = "Beans Binding (JSR 295) reference implementation"
DESCRIPTION = "In essence, Beans Binding (JSR 295) is about keeping two properties \
(typically of two objects) in sync. An additional emphasis is placed on \
the ability to bind to Swing components, and easy integration with IDEs \
such as NetBeans. This project provides the reference implementation."
LICENSE = "LGPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "beansbinding-javadoc-1.2.1-29.24.noarch.rpm"
RPM_HASH = "9f2ae1fcab11aee4142fd9e383d40df810946057690ad01fddddc7251bf78b07f6b2fce3ec3f32c870eb97b76c6dd241d38df2d11af873ca49ec79bf7dbd5f31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "beansbinding-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
