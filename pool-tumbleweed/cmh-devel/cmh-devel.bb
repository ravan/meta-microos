SUMMARY = "Development files for the cmh library"
DESCRIPTION = "This software package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
This subpackage provides the development headers for libcmh."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "cmh-devel-1.1.1-1.16.aarch64.rpm"
RPM_HASH = "f0899fca55e504153bff41ab69427f30cb7fcdecdfad51ca415e2e5e80f9553d2eb9082a759e6d8ed8056b8847e8166b31d2cc3318f5cc4ce6ae7272cf0d6a5f"

RPROVIDES:${PN} += "cmh-devel"

RDEPENDS:${PN} += "libcmh0 \
mpc-devel"

inherit rpm
