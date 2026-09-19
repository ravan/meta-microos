SUMMARY = "CLI tool for Machine ID"
DESCRIPTION = "Machine ID is a service that programmatically issues and renews short-lived \
certificates to any service account (e.g., a CI/CD server) by retrieving \
credentials from the Teleport Auth Service. This enables fine-grained \
role-based access controls and audit. \
tbot is the executable belonging to the Machine ID service."
LICENSE = "Apache-2.0"

PV = "17.7.26"

RPM_NAME = "teleport-tbot-17.7.26-1.4.aarch64.rpm"
RPM_HASH = "9c91d1236916f5f04b643293ee42af2ecac26a3df7d9859894afaaf39735e72294c83e9421b3186cd9123bb6e5b90070799ffb53ce6481a8bb83381d97615004"

RPROVIDES:${PN} += "config-teleport-tbot \
teleport-tbot"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
