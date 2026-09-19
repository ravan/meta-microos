SUMMARY = "DocBook CSS Stylesheets"
DESCRIPTION = "These cascading stylesheets allow you to view a DocBook XML document in \
software that supports XML styled with CSS2, for example, a recent \
Mozilla or Firefox browser. For more complex modifications of your XML \
document use the DocBook XSL stylesheets."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "docbook-css-stylesheets-0.4-161.24.noarch.rpm"
RPM_HASH = "13a89394e5c720cdba9e49a53b786cf4b0fe627586825c38f14af27ac8429be289c4cf5a366d545d0c0b2c98c21b9110239b62a7fdfe319eedb8909338adda63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbook-css-stylesheets"

RDEPENDS:${PN} += ""

inherit rpm
