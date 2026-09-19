SUMMARY = "Path::Tiny types and coercions for Moose and Moo"
DESCRIPTION = "This module provides Path::Tiny types for Moose, Moo, etc. \
 \
It handles two important types of coercion: \
 \
  * coercing objects with overloaded stringification \
 \
  * coercing to absolute paths \
 \
It also can check to ensure that files or directories exist."
LICENSE = "Apache-2.0"

PV = "0.006"

RPM_NAME = "perl-Types-Path-Tiny-0.006-1.24.noarch.rpm"
RPM_HASH = "2edc08f8428f59c699501f0246ef9aa0aa58f2145c2aa9d6275ed618b7ca29fa290503207d1008003f41a31aad75639d470809edabc41638205e06bb1cdb8773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Types--Path--Tiny \
perl-Types-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Path--Tiny \
perl-Type--Library \
perl-Type--Utils \
perl-Types--Standard \
perl-Types--TypeTiny"

inherit rpm
