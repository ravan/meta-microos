SUMMARY = "Natural layout for Swing panels"
DESCRIPTION = "Swing Layout Extensions goal is to make it easy to create \
   professional cross platform layouts with Swing. This project has \
   an eye towards the needs of GUI builders, such as NetBeans. This \
   project consists of the following pieces: * Ability to get the \
   baseline for components. \
 \
* Ability to get the preferred gap between components. \
 \
A new LayoutManager that utilizes both of these concepts and is tuned \
toward a free-form drag and drop layout model as can be provided by GUI \
builders."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "swing-layout-javadoc-1.0.3-37.18.noarch.rpm"
RPM_HASH = "30707ff68aeeb21db05c1d9181092e8b26bdb2f010356b13d84da29365fbd6efd7e97e14b38b1b1b56a2643f2e6dd686796f23a5addab84ea19ee2fd999da144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-layout-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
