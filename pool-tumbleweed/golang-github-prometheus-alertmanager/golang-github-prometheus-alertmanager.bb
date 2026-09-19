SUMMARY = "Prometheus Alertmanager"
DESCRIPTION = "The Alertmanager handles alerts sent by client applications such as the \
Prometheus server. It takes care of deduplicating, grouping, and routing \
them to the correct receiver integration such as email, PagerDuty, or \
OpsGenie. It also takes care of silencing and inhibition of alerts."
LICENSE = "Apache-2.0"

PV = "0.33.1"

RPM_NAME = "golang-github-prometheus-alertmanager-0.33.1-1.2.aarch64.rpm"
RPM_HASH = "ca73fcbf10d3da215569587725c7cc566a4d1e48409620750d77a7393be531f86a4ca8bac37da93491ba448f19944fcb4086204c765b349b20c7121355c6cbd6"

RPROVIDES:${PN} += "config-golang-github-prometheus-alertmanager \
golang-github-prometheus-alertmanager \
prometheus-alertmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
group-prometheus \
user-prometheus"

inherit rpm
