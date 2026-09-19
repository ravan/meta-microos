SUMMARY = "Database-backed asynchronous priority queue system -- Extracted from"
DESCRIPTION = "Delayed_job (or DJ) encapsulates the common pattern of asynchronously \
executing longer tasks in the background. It is a direct extraction from \
Shopify where the job table is responsible for a multitude of core tasks."
LICENSE = "MIT"

PV = "4.1.13"

RPM_NAME = "ruby4.0-rubygem-delayed_job-4.1.13-1.8.aarch64.rpm"
RPM_HASH = "fe324f728867050498f4daae785e30e064f8508558308ac09344ba793aa39de7cfe390b740501b5a0c7ec231068ade1336bee3515f5fa2a23683a9759e8e4ed4"

RPROVIDES:${PN} += "ruby4.0-rubygem-delayed-job \
rubygem-delayed-job \
rubygem-ruby-4.0.0-delayed-job \
rubygem-ruby-4.0.0-delayed-job-4 \
rubygem-ruby-4.0.0-delayed-job-4.1 \
rubygem-ruby-4.0.0-delayed-job-4.1.13"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activesupport"

inherit rpm
