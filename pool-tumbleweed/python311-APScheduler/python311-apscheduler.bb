SUMMARY = "In-process task scheduler with Cron-like capabilities"
DESCRIPTION = "Advanced Python Scheduler (APScheduler) is an in-process task \
scheduler that lets you schedule jobs (functions or any python callables) to be \
executed at any time of your choosing. \
 \
This can be an alternative to externally run cron scripts for \
long-running applications (e.g. web applications), as it is platform neutral \
and can access the application's variables and functions. \
 \
APscheduler provides multiple job stores. \
 \
* Configurable scheduling mechanisms (triggers): \
  * Cron-like scheduling \
  * Delayed scheduling of single run jobs (like the UNIX 'at' command) \
  * Interval-based (run a job at specified time intervals) \
* Multiple, simultaneously active job stores: \
  * RAM \
  * File-based simple database (shelve) \
  * SQLAlchemy (any supported RDBMS works) \
  * MongoDB"
LICENSE = "MIT"

PV = "3.10.4"

RPM_NAME = "python311-APScheduler-3.10.4-1.6.noarch.rpm"
RPM_HASH = "18e344812caf9ea950fc9fbecd18ff5432f83fcac8579e193f4d45a4741ea16b22a2c4d7d66cab07f6dd4c96f59fa8f8969fc67767c0d7dd98a8237a6d5cd511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-APScheduler \
python3.11dist-apscheduler \
python311-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-six \
python311-tzlocal"

inherit rpm
