SUMMARY = "ActiveRecord backend for DelayedJob"
DESCRIPTION = "ActiveRecord backend for Delayed::Job, originally authored by Tobias Lütke."
LICENSE = "MIT"

PV = "4.1.11"

RPM_NAME = "ruby4.0-rubygem-delayed_job_active_record-4.1.11-1.8.aarch64.rpm"
RPM_HASH = "556a76175d9b60e8f35cc81000118e2e3d5234366a437ce177f3fd26f47dcf92ec40670edd27609db8025390d3b74f9a5c0a278661bd245a12ea275ba8358723"

RPROVIDES:${PN} += "ruby4.0-rubygem-delayed-job-active-record \
rubygem-delayed-job-active-record \
rubygem-ruby-4.0.0-delayed-job-active-record \
rubygem-ruby-4.0.0-delayed-job-active-record-4 \
rubygem-ruby-4.0.0-delayed-job-active-record-4.1 \
rubygem-ruby-4.0.0-delayed-job-active-record-4.1.11"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-4.0.0-activerecord \
rubygem-ruby-4.0.0-delayed-job"

inherit rpm
