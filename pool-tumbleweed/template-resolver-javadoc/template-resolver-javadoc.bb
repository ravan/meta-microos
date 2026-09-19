SUMMARY = "API Documentation for template-resolver"
DESCRIPTION = "JavaDoc documentation for template-resolver"
LICENSE = "Apache-2.0"

PV = "0.1"

RPM_NAME = "template-resolver-javadoc-0.1-3.8.noarch.rpm"
RPM_HASH = "22665bed6222947fd7358bdf9d41b8405ac6a15de7e28b75f3f02604f259895366e880ad4762df724e9adbe5b3af4fae5e749b287703065827c3397eb32129c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "template-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
