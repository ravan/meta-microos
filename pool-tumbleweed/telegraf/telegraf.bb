SUMMARY = "The plugin-driven server agent for collecting & reporting metrics"
DESCRIPTION = "Telegraf is an agent written in Go for collecting, processing, aggregating, and writing metrics. \
 \
Design goals are to have a minimal memory footprint with a plugin system so that developers in the community can \
easily add support for collecting metrics from local or remote services."
LICENSE = "MIT"

PV = "1.40.0"

RPM_NAME = "telegraf-1.40.0-1.1.aarch64.rpm"
RPM_HASH = "90f0df90889d59ba8ab262cf2695cbdfb56ef0e6c97085da713a5a659e1ab74336a193a3eba1e19fdf79a07613d9239689af9a46acb5a1ca52e150afd818234d"

RPROVIDES:${PN} += "config-telegraf \
telegraf"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
