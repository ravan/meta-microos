SUMMARY = "Validate data against a schema, minimally"
DESCRIPTION = "This module aims to be a slimmed-down at https://json-schema.org/ evaluator \
and validator, supporting the most popular keywords. (See UNSUPPORTED JSON \
SCHEMA FEATURES below for exclusions.)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34.0"

RPM_NAME = "perl-JSON-Schema-Tiny-0.34.0-1.1.noarch.rpm"
RPM_HASH = "8815371f203a44a497e6ff0a511cbabe5c462b1a09ffef43340b48b61318463e6e8dc3672594d91527072f25e1d53989e6934ebfb02d9bbe883c791e694f35d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--Schema--Tiny \
perl-JSON-Schema-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Cpanel--JSON--XS \
perl-Feature--Compat--Try \
perl-Mojolicious \
perl-autovivification \
perl-builtin--compat \
perl-experimental \
perl-stable"

inherit rpm
