SUMMARY = "Unsynchronize asyncio"
DESCRIPTION = " \
Unsynchronize `asyncio` by using an ambient event loop in a separate thread. \
 \
 \
1. Mark all async functions with `@unsync`. May also mark regular \
   functions to execute in a separate thread. \
    * All `@unsync` functions, async or not, return an `Unfuture` \
2. All `Futures` must be `Unfutures` which includes the result of an \
   `@unsync` function call, or wrapping `Unfuture(asyncio.Future)` or \
   `Unfuture(concurrent.Future)`. `Unfuture` combines the behavior of \
   `asyncio.Future` and `concurrent.Future`: \
   * `Unfuture.set_value` is threadsafe unlike `asyncio.Future` \
   * `Unfuture` instances can be awaited, even if made from \
     `concurrent.Future` \
   * `Unfuture.result()` is a blocking operation *except* in \
     `unsync.loop`/`unsync.thread` where it behaves like \
     `asyncio.Future.result` and will throw an exception if the future \
     is not done \
3. Functions will execute in different contexts: \
   * `@unsync` async functions will execute in an event loop in \
     `unsync.thread` \
   * `@unsync` regular functions will execute in \
     `unsync.thread_executor`, a `ThreadPoolExecutor` \
   * `@unsync(cpu_bound=True)` regular functions will execute in \
     `unsync.process_executor`, a `ProcessPoolExecutor`"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-unsync-1.4.0-1.7.noarch.rpm"
RPM_HASH = "eb8e8db431483197239b2f1486b5ab2879228f389270f8ab566df3f7ff3019b3bcbd3ffcbfc12057649e175b962380b3f4f2096f3e4bfff2373ac32fa66bbdc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unsync \
python3.13dist-unsync \
python313-unsync \
python3dist-unsync"

RDEPENDS:${PN} += "python-abi"

inherit rpm
