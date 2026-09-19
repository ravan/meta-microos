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

RPM_NAME = "swing-layout-1.0.3-37.18.noarch.rpm"
RPM_HASH = "a44f0f1bfaa9c5e9eeae755986e4abc2caa3f61898dc14a0b67ff8519397b784e7db3144055bc12a42cf359fabef26c9d07758d4d7b29527cf196a29f14e0caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-layout"

RDEPENDS:${PN} += "java"

inherit rpm
