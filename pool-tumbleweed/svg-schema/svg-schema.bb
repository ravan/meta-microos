SUMMARY = "SVG DTD and RELAX NG Schema"
DESCRIPTION = "Contains the following DTDs: \
 \
* 'Scalable Vector Graphics' (SVG) 1.0 Specification, W3C \
  Recommendation 04 September 2001. \
 \
* 'Scalable Vector Graphics' (SVG) 1.1 Specification, W3C \
  Recommendation 14 January 2003."
LICENSE = "BSD-3-Clause"

PV = "20030114"

RPM_NAME = "svg-schema-20030114-125.2.noarch.rpm"
RPM_HASH = "74aac6570a79d5d3e01eb0894f60191f3258fc41efb55bf851f2602e5d20dee7ad678fa183e10b694e05d34a18025218bdcebeab97bcd040c91aec3a8fb94574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-svg-schema \
svg-dtd \
svg-schema"

RDEPENDS:${PN} += "/usr/bin/sh \
sgml-skel"

inherit rpm
