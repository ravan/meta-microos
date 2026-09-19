SUMMARY = "YAML-enhanced TAP output for your tests"
DESCRIPTION = "'Test2::Formatter::YAMLEnhancedTAP' provides context on failed assertions \
as YAML snippets following TAP version 13 grammar. \
 \
The sole purpose of this module is to be used with \
TAP::Formatter::GitHubActions to bring more accurate annotations."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0.5"

RPM_NAME = "perl-Test2-Formatter-YAMLEnhancedTAP-0.0.5-1.14.noarch.rpm"
RPM_HASH = "3e4d5a41ee541d03cf6d46ecc1254593d03b107925beb80b75eb7700a86da81fd2702525cef43c63f6d46e9146fb1ec2a73b535b73e04e4d0fd0b85aa83f759a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test2--Formatter--YAMLEnhancedTAP \
perl-Test2-Formatter-YAMLEnhancedTAP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-TAP--Harness"

inherit rpm
