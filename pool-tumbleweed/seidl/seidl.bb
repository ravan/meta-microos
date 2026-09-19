SUMMARY = "Complementary light pint client"
DESCRIPTION = "seidl is a lightweight pint query utility designed for easy usage. It displays the current SUSE publiccloud images according to customizable filter rules. \
 \
In aims at complementing the public-cloud-info-client by the feature to display all current not-deleted and not-deprecated images in a nice table on the console."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "seidl-0.3-1.2.aarch64.rpm"
RPM_HASH = "470e5c2ce5adef398cecd176480ce5ae6c115ae1c19d9fc9066e2914a112f07fd892025f5b4708b6d6167120e2d79fa962882e55440fab24e3bb77407bc4cf60"

RPROVIDES:${PN} += "seidl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
