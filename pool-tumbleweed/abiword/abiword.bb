SUMMARY = "A Multiplatform Word Processor"
DESCRIPTION = "AbiWord is a multiplatform word processor with a GTK+ interface on the \
UNIX platform."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "abiword-3.0.8-1.5.aarch64.rpm"
RPM_HASH = "16a35313fc90f1c57fe15ea48f4f2e109eab4767446e8637664a61cb0bd37e570cf4e03042cf49ba792f24fe714cf7ad2083d1f041c125048caeb5f621afb9bd"

RPROVIDES:${PN} += "abiword"

RDEPENDS:${PN} += "libabiword-3.0.so \
libc.so.6"

inherit rpm
