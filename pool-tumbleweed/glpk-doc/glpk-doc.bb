SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-doc-5.0-5.3.noarch.rpm"
RPM_HASH = "49a7f89e981a8c2aab7de8e8809c3fa27e0903c1327cfd63ce71dbc7b07fc77a41bbf6efec0243a9d1877d06a55f735e7e1ae3eaee9810abac8df771f0ca793f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glpk-doc"

RDEPENDS:${PN} += ""

inherit rpm
