SUMMARY = "Load configuration from different file formats, transparently"
DESCRIPTION = "Config::Any provides a facility for Perl applications and libraries to load \
configuration data from multiple different file formats. It supports XML, \
YAML, JSON, Apache-style configuration, Windows INI files, and even Perl \
code. \
 \
The rationale for this module is as follows: Perl programs are deployed on \
many different platforms and integrated with many different systems. \
Systems administrators and end users may prefer different configuration \
formats than the developers. The flexibility inherent in a multiple format \
configuration loader allows different users to make different choices, \
without generating extra work for the developers. As a developer you only \
need to learn a single interface to be able to use the power of different \
configuration formats."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Config-Any-0.33-1.17.noarch.rpm"
RPM_HASH = "cc020cf5efa310243efda6d0aa9d92803751da2798cea97f0a310ebda6e0fab0654f71d4841a1f38101b97e3603bff62f244c685fe6b3e942701f5b2fef5e7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Any \
perl-Config--Any--Base \
perl-Config--Any--General \
perl-Config--Any--INI \
perl-Config--Any--JSON \
perl-Config--Any--Perl \
perl-Config--Any--XML \
perl-Config--Any--YAML \
perl-Config-Any"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Module--Pluggable--Object"

inherit rpm
