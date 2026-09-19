SUMMARY = "Users in the wheel group can authenticate as admin"
DESCRIPTION = "run0 authentication policy that allows users in the wheel group to \
authenticate as root with their own password."
LICENSE = "BSD-2-Clause"

PV = "0.5.0+git20260822.4d653d8"

RPM_NAME = "run0-policy-wheel-auth-self-0.5.0+git20260822.4d653d8-1.1.noarch.rpm"
RPM_HASH = "f3192763b58065298a66db4ef3f626d380180c7b866c6d12bc22bd06e5af1c71b376a66a586c04e0ab1fdc132298db6f8bd2ab309545038f68c7f5ed486837ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "run0-policy-wheel-auth-self"

RDEPENDS:${PN} += "group-wheel \
run0-wrappers"

inherit rpm
