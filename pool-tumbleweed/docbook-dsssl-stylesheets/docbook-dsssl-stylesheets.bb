SUMMARY = "DSSSL Stylesheets for the DocBook DTD"
DESCRIPTION = "Use these DSSSL stylesheets to convert DocBook documents into other \
formats. 'Print' (TeX and RTF) and 'online' (HTML) output formats are \
available. \
 \
The stylesheets are customizable and, within limits, it is possible to \
adapt them for your own needs. Numerous native languages are supported. \
 \
The authors of these stylesheets do not inlude any new features, but \
only fix bugs."
LICENSE = "SUSE-XSL-Lint"

PV = "1.79"

RPM_NAME = "docbook-dsssl-stylesheets-1.79-177.3.noarch.rpm"
RPM_HASH = "91f7b58fff040fa113a7be7f049eea9f64f5a21a7c7d08be5905fd984ee27c45692160050d99134c3bb6288103a47854cc748c16d34ea437b81166346c8e1ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docbkdsl \
docbook-dsssl-stylesheets"

RDEPENDS:${PN} += "/usr/bin/sgml-register-catalog \
/usr/bin/sh \
docbook-3 \
docbook-4"

inherit rpm
