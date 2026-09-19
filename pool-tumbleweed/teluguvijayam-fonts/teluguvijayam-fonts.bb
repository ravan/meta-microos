SUMMARY = "TrueType fonts for Telugu script (te)"
DESCRIPTION = "This package provides following 20 fonts for Telugu script \
which is used in Indian states of Andhra Pradesh & Telangana \
 \
  * Ponnala \
  * RaviPrakash \
  * LakkiReddy \
  * Potti Sriramulu \
  * Syamala Ramana \
  * Gidugu \
  * Gurajada \
  * Suravaram \
  * NTR \
  * Mandali \
  * NATS \
  * SrikrushnaDevaraya \
  * Peddana \
  * Timmana \
  * Tenali Ramakrishna \
  * Suranna \
  * Ramaraja \
  * Mallana \
  * Dhurjati \
  * Ramabhadra \
 \
 These fonts are released by Departement of Information \
 technology, Government of Andhra Pradesh. \
 \
Designer: Silicon Andhra"
LICENSE = "OFL-1.1"

PV = "0.1"

RPM_NAME = "teluguvijayam-fonts-0.1-1.7.noarch.rpm"
RPM_HASH = "2b2d652290dd91a07aaae0cfcb48cf329d8e712ec8da80df53e7e75baaab69a5ed16b8e21a0d633ab2819c483c760c0cf11798d38a9129a9a961292ee58b9674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "teluguvijayam-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
