SUMMARY = "Acceptance testing for JSON-Schema based validators"
DESCRIPTION = "at http://json-schema.org is an IETF draft (at time of writing) which \
allows you to define the structure of JSON. \
 \
From the overview of the draft 2020-12 version of the \
specification|https://json-schema.org/draft/2020-12/json-schema-core.html#r \
fc.section.3: \
 \
    This document proposes a new media type 'application/schema+json' to \
    identify a JSON Schema for describing JSON data. It also proposes a \
    further optional media type, 'application/schema-instance+json', to \
    provide additional integration features. JSON Schemas are themselves \
    JSON documents. This, and related specifications, define keywords \
    allowing authors to describe JSON data in several ways. \
 \
    JSON Schema uses keywords to assert constraints on JSON instances or \
    annotate those instances with additional information. Additional \
    keywords are used to apply assertions and annotations to more complex \
    JSON data structures, or based on some sort of condition. \
 \
This module allows other perl modules (for example JSON::Schema::Modern) to \
test that they are JSON Schema-compliant, by running the tests from the \
official test suite, without having to manually convert them to perl tests. \
 \
You are unlikely to want this module, unless you are attempting to write a \
module which implements JSON Schema the specification, and want to test \
your compliance."
LICENSE = "MIT"

PV = "1.38.0"

RPM_NAME = "perl-Test-JSON-Schema-Acceptance-1.38.0-1.1.noarch.rpm"
RPM_HASH = "faca65e919dfda2ee50fe0e174f288e6b2f97a02e4d5ab344edf9a00f8bd14726b1a7956ff505c4f6fce615e21f17505128c07741ab2bd83148318219914fb5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--JSON--Schema--Acceptance \
perl-Test-JSON-Schema-Acceptance"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Feature--Compat--Try \
perl-File--ShareDir \
perl-Git--Wrapper \
perl-JSON--PP \
perl-List--Util \
perl-Mojolicious \
perl-Moo \
perl-MooX--TypeTiny \
perl-Path--Tiny \
perl-Test2--Todo \
perl-Types--Common--Numeric \
perl-Types--Standard \
perl-autovivification \
perl-experimental \
perl-namespace--clean \
perl-stable \
perl-strictures"

inherit rpm
