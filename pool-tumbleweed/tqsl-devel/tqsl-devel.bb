SUMMARY = "The TrustedQSL Library development tools"
DESCRIPTION = "Header files needed to build TrustedQSL applications."
LICENSE = "SUSE-Permissive"

PV = "2.8.6"

RPM_NAME = "tqsl-devel-2.8.6-1.2.aarch64.rpm"
RPM_HASH = "6c23567e2885eb1c9c1b4e7c273ea6d410096ea638f6b8beca0bdac9b46d3517bf545ed83519c60c08a3aac715cf1548c31dd55fb53945b55fd74e3ba234099b"

RPROVIDES:${PN} += "tqsl-devel"

RDEPENDS:${PN} += "libtqsllib2-8-6"

inherit rpm
