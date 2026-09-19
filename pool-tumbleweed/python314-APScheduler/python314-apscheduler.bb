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

RPM_NAME = "python314-APScheduler-3.11.3-1.1.noarch.rpm"
RPM_HASH = "d15d4dd19ce33a072587609b0688727ec1fc48ce8c69e5ffe58fdf493f0cc658daaeccf40478685a1de5b4b45a58a5a9746ab44d086e3b71d7a98a68db0acbe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apscheduler \
python314-APScheduler \
python3dist-apscheduler"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-pytz \
python314-tzlocal"

inherit rpm
