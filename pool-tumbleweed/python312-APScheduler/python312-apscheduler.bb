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

RPM_NAME = "python312-APScheduler-3.10.4-1.6.noarch.rpm"
RPM_HASH = "10d3f6b3e0312941988751c1c14bf97a922b46b6cd5f7838c9e4811632fc54e99a47d924967412e9adbbda895c883685956f0030a83117011f0d6a64141c1450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-apscheduler \
python312-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python312-pytz \
python312-six \
python312-tzlocal"

inherit rpm
