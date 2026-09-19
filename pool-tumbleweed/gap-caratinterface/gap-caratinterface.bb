SUMMARY = "GAP: Interface to CARAT, a crystallographic groups package"
DESCRIPTION = "This package provides GAP interface routines to some of the \
stand-alone programs of CARAT, a package for the computation with \
crystallographic groups. CARAT is to a large extent complementary to \
the GAP package Cryst. In particular, it provides routines for the \
computation of normalizers and conjugators of finite unimodular \
groups in GL(n,Z), and routines for the computation of Bravais \
groups, which are all missing in Cryst. A catalog of Bravais groups \
up to dimension 6 is also provided."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.3.11"

RPM_NAME = "gap-caratinterface-2.3.11-1.1.noarch.rpm"
RPM_HASH = "76351f96d66e87ed95372fc621c51bc9d41d911413a38128ab72a1fb8acc71acc6e95a294ff96e366f7982700ccff36bb02cfb0ad4dbeb5cb18228c14fa1e6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-carat \
gap-caratinterface"

RDEPENDS:${PN} += "carat \
gap-core \
gap-io"

inherit rpm
