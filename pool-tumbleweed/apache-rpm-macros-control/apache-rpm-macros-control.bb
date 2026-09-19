SUMMARY = "Apache RPM Macros"
DESCRIPTION = "Macros intended for Apache restarts in rpm scriptlets."
LICENSE = "Apache-2.0"

PV = "20151110"

RPM_NAME = "apache-rpm-macros-control-20151110-3.18.aarch64.rpm"
RPM_HASH = "b5e230f334a27a8d87c25e5535d6afd4b58e6b30e641843e45daf3bcc5c272c0ac277b5cfb1807d73a5b8b6621e7cfd5fe68d7df78c018be78a5da892854f5d2"

RPROVIDES:${PN} += "apache-rpm-macros-control \
rpm-macro-apache-request-restart \
rpm-macro-apache-restart-flag \
rpm-macro-apache-restart-if-needed"

RDEPENDS:${PN} += ""

inherit rpm
