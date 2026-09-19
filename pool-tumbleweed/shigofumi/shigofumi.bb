SUMMARY = "Command line client for accessing the Czech Data Boxes"
DESCRIPTION = "This is Shigofumi, an ISDS (Informační systém datových schránek / Data Box \
Information System) client."
LICENSE = "GPL-3.0+"

PV = "0.9"

RPM_NAME = "shigofumi-0.9-1.19.aarch64.rpm"
RPM_HASH = "85fa45f444d5a349a754fd1b8d0dd8ae76831a0b7fdc5788e39cd5aa46fba51ea40b725af75e5aaede5427ed2456f7bce37261b6f2df327c1d38340011021e71"

RPROVIDES:${PN} += "shigofumi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libisds.so.5 \
libmagic.so.1 \
libreadline.so.8 \
libxml2.so.16"

inherit rpm
