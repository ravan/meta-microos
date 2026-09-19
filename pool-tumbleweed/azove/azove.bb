SUMMARY = "Another Zero One Vertex Enumeration tool"
DESCRIPTION = "azove is a tool designed for counting (without explicit enumeration) \
and enumeration of 0/1 vertices. \
 \
Given a polytope by a linear relaxation or facet description P = {x | \
Ax <= b}, all 0/1 points lying in P can be counted or enumerated. \
This is done by intersecting the polytope P with the unit-hypercube \
[0,1]^d. The integral vertices (no fractional ones) of this \
intersection will be enumerated. If P is a 0/1 polytope, azove solves \
the vertex enumeration problem. In fact, it can also solve the 0/1 \
knapsack problem and the 0/1 subset sum problem."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "azove-2.0-3.11.aarch64.rpm"
RPM_HASH = "c1de1bc5fb54f1a901a15c372bc5e6e245170bf772965810cfda57c3350b8ca3383f51029b13adcf2945d71e260529855db59989c2f4bcd9c94e444e504a2773"

RPROVIDES:${PN} += "azove"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6"

inherit rpm
