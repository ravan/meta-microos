SUMMARY = "Validate data against a JSON schema"
DESCRIPTION = "JSON::Validator is a data structure validation library based around at \
https://json-schema.org/. This module can be used directly with a JSON \
schema or you can use the elegant DSL schema-builder JSON::Validator::Joi \
to define the schema programmatically."
LICENSE = "Artistic-2.0"

PV = "5.190.0"

RPM_NAME = "perl-JSON-Validator-5.190.0-1.3.noarch.rpm"
RPM_HASH = "76767a83df4e05c8241634162705aa4e120d30e7e07c06aedec42a3435d086aeca2fbf3b500936517baeac5cf046972ef977e8333c386f5ab314f88ee97827db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-JSON--Validator \
perl-JSON--Validator--Error \
perl-JSON--Validator--Formats \
perl-JSON--Validator--Joi \
perl-JSON--Validator--Schema \
perl-JSON--Validator--Schema--Draft201909 \
perl-JSON--Validator--Schema--Draft4 \
perl-JSON--Validator--Schema--Draft6 \
perl-JSON--Validator--Schema--Draft7 \
perl-JSON--Validator--Schema--OpenAPIv2 \
perl-JSON--Validator--Schema--OpenAPIv3 \
perl-JSON--Validator--Store \
perl-JSON--Validator--URI \
perl-JSON--Validator--Util \
perl-JSON-Validator"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Validate--Domain \
perl-Data--Validate--IP \
perl-List--Util \
perl-Mojolicious \
perl-Net--IDN--Encode \
perl-YAML--XS"

inherit rpm
