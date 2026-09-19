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

PV = "3.11.3"

RPM_NAME = "python313-APScheduler-3.11.3-1.1.noarch.rpm"
RPM_HASH = "ea03ae73f610cc5f4c6c1a179b4fffa27d5c1642ec9113bec34d768f197ff54d5fd570d16063f39eda14018233bc7d3d3228711d4b712602a7e2066c2f81b9a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-APScheduler \
python3.13dist-apscheduler \
python313-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-pytz \
python313-tzlocal"

inherit rpm
