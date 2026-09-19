SUMMARY = "Simple OBS API calls"
DESCRIPTION = "Net::OBS::Client aims to simplify usage of OBS \
(https://openbuildservice.org) API calls in perl."
LICENSE = "Artistic-2.0"

PV = "0.1.3"

RPM_NAME = "perl-Net-OBS-Client-0.1.3-1.12.noarch.rpm"
RPM_HASH = "0ad2aa06cf2a78ba73d26c89aaac1e9c994f70598bcfe21aed89e89278e21903a60546500ded288b6c8cdf2815c4b24a2f457eb4b7ef303c3441cc3846f4196d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OBS--Client \
perl-Net--OBS--Client--BuildResults \
perl-Net--OBS--Client--DTD \
perl-Net--OBS--Client--Package \
perl-Net--OBS--Client--Project \
perl-Net--OBS--Client--Roles--BuildStatus \
perl-Net--OBS--Client--Roles--Client \
perl-Net--OBS--LWP--UserAgent \
perl-Net--OBS--SigAuth \
perl-Net-OBS-Client"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Config--INI--Reader \
perl-Config--Tiny \
perl-Const--Fast \
perl-HTTP--Cookies \
perl-HTTP--Request \
perl-LWP--UserAgent \
perl-Moose \
perl-Moose--Role \
perl-Path--Class \
perl-URI--URL \
perl-XML--Structured"

inherit rpm
